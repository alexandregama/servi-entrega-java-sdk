package com.servientrega.sdk;

import com.servientrega.InformacionGuiaMov;
import com.servientrega.WsRastreoEnvios;
import com.servientrega.WsRastreoEnviosSoap;

public class Test {

	public static void main(String[] args) {
		WsRastreoEnvios webservice = new WsRastreoEnvios();
		
		WsRastreoEnviosSoap tracker = webservice.getWsRastreoEnviosSoap();
		InformacionGuiaMov guia = tracker.consultarGuia("230567335");
		
		System.out.println(guia.getNumGui());
	}
	
}
