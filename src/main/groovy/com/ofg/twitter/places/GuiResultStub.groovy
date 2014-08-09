package com.ofg.twitter.places

import com.ofg.infrastructure.Stub
import groovy.transform.TypeChecked

import static com.github.tomakehurst.wiremock.client.WireMock.*
import static com.ofg.infrastructure.GuiMediaType.CONTENT_TYPE
import static com.ofg.infrastructure.GuiMediaType.V1_JSON

@TypeChecked
class GuiResultStub {

    @Stub
    public static void validateResult() {
        stubFor(
                put(urlMatching('/rest/results/result'))
                        .withHeader(CONTENT_TYPE, equalTo(V1_JSON))
                    .withRequestBody(matchingJsonPath('$.pairId'))
                    .withRequestBody(matchingJsonPath('$.relationships'))
                    .withRequestBody(matchingJsonPath('$.relationships[*].relations'))
                    .withRequestBody(matchingJsonPath('$.relationships[*].correlatorType'))

                        .willReturn(aResponse()
                        .withStatus(200)
                ))




    }

}
