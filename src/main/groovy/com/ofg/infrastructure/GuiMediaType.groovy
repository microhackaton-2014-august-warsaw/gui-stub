package com.ofg.infrastructure

import groovy.transform.TypeChecked

@TypeChecked
class GuiMediaType {

    public static final String CONTENT_TYPE = "Content-Type"

    protected static final String APPLICATION_TYPE = 'application/vnd.gui'

    private static final String JSON = '+json'

    public static final String V1_JSON = APPLICATION_TYPE + ".v1" + JSON

}
