package com.mbudnek.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.xbill.DNS.Address;

class Demo {
  public Demo() {
  }

  public InetAddress lookup(String host) {
    try {
      return Address.getByName(host);
    } catch (UnknownHostException ex) {
      return null;
    }
  }
}
