/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.httpURLConnection;

import java.io.*;
import java.net.*;

/**
 *
 * @author Robert Palmer
 */

// This class is focused on HttpURLConnections
public class HTTPConnect {
    public static void main(String[] args) throws Exception {
    // Step 1: Create a URL object
    URL url = new URL("https://www.lds.org");
    
    // Step 2: Obtain a URLConnection object from the URL
    URLConnection connect = url.openConnection();
    
    // Step 3: Configure the URLConnection
    // Step 4: Read the header fields (Optional)
    // Step 5: Get an input stream and read data (Optional)
    BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()));
    String inputLine;
    // Step 6: Get an output stream and write data (Optional)
    while ((inputLine = in.readLine()) != null)
        System.out.println(inputLine);
    
    // Step 7: Close the connection
    in.close();
    
    }
}
