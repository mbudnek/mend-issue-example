package com.mbudnek.demo;

import java.net.UnknownHostException;

import org.xbill.DNS.Address;

public final class Application {
  public static void main(String[] args) throws UnknownHostException {
    Demo demo = new Demo();
    System.out.println(demo.lookup("google.com"));
    System.out.println(Address.getByName("google.com"));
  }
}
