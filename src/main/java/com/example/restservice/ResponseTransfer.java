/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restservice;

/**
 *
 * @author elahi
 */
public class ResponseTransfer {
        private String text; 
        
        public ResponseTransfer(String textT){
            this.text=textT;
        }

    public String getText() {
        return text;
    }

    
}
