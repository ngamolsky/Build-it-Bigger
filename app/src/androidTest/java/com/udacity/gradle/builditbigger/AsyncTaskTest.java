package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.TimeUnit;

/**
 * Created by nikitagamolsky on 10/8/15.
 */
public class AsyncTaskTest extends AndroidTestCase {
    public void testVerifyAsyncResponse() {
        try {
            EndpointsAsyncTask jokeTask = new EndpointsAsyncTask();
            jokeTask.execute(getContext());
            jokeTask.get(30, TimeUnit.SECONDS);
        } catch (Exception e){
            fail("Timed out");
        }
    }
}
