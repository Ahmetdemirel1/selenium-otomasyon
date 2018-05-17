package com.deneme.twitter;

import org.junit.Test;

import static org.junit.Assert.*;

public class facebookTest extends Base {

    @Test
    public void facebookLogin() {
        new facebook(driver).facebookLogin();
    }
}