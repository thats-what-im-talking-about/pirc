package com.pirc.api;

import java.util.Date;

public interface Deal {
    Date getValidFrom();
    Date getValidTo();
    String getTitle();
    String getDescription();
    String getTerms();
}
