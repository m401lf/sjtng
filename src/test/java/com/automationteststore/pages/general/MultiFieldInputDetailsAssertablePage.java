package com.automationteststore.pages.general;

import java.util.Map;

public interface MultiFieldInputDetailsAssertablePage extends MultiFieldInputDetailsPage {

    void assertOnCorrectContentInFields(Map<String, String> fieldDataFromPage);

}
