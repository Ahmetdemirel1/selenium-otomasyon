package com.deneme.twitter;

import org.junit.Test;

import static org.junit.Assert.*;

public class tweetTest extends Base {

    @Test
    public void tweet() {
        new tweet(driver).tweet();

    }
}