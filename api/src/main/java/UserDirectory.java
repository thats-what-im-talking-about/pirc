package com.pirc.api;

public interface UserDirectory {
    User createUser(User u);
    User lookupCurrentUser();
}
