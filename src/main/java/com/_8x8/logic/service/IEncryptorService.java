/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com._8x8.logic.service;

/**
 *
 * @author ttran
 */
public interface IEncryptorService {

    public String encryptCode(String plainText) throws Exception;

    public String decryptCode(String encrypted) throws Exception;
}
