package com.pirc.api;

/**
 * What system would be complete without a user.
 *
 * @since "The Quick Start Anti-pattern"
 */
public interface User {
    String getId();
    String getEmail();
    String getPassword();
    String getFirstName();
    String getLastName();
}
