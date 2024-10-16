package com.squaretrade.chainofresponsibility;

public class Client {

    public static void main(String[] args) {

        SupportHandler level1Handler = new Level1Supporthandler();
        SupportHandler level2Handler = new Level2Supporthandler();
        SupportHandler level3Handler = new Level3Supporthandler();

        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);


        level1Handler.handleRequest(new Request(Priority.NONE));

    }

}
