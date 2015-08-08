package com.example.framework;

import java.io.IOException;

/**
 * Created by Emma on 8/4/2015.
 */
public class ProcessHelper extends HelperBase{

    private Process process;

    public ProcessHelper(ApplicationManager applicationManager) {
        super(applicationManager);
    }

    public void startAppUnderTest() throws IOException {
        String command = manager.getProprty("app.path");
        process = Runtime.getRuntime().exec(command);
    }

    public void stopAppUnderTest(){
        process.destroy();

    }
}
