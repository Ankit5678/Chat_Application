package com.rmi.client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatClientIF extends Remote {
	void retriveMessage(String message) throws RemoteException;
	
}
