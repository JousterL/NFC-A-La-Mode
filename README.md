NFC-A-La-Mode
=============

Near Field Communication for Applications - Legacy Android Mode

This project is designed to provide Near Field Communications hardware for Android phones. The Android Operating System has provided a NFC library since 2.3 Gingerbread, but the majority of phones released at the time (2010) did not have the requisite hardware to take advantage of this library.

We intend to implement this project using an Arduino MEGA ADK board, which provides direct UHCI communication through Android's USB port (found here: http://www.amazon.com/Arduino-MEGA-ADK-Board-Android/dp/B005CIU14U/ref=pd_sim_pc_10) and and Arduino-compatible Near Field Communication shield (found here: http://www.seeedstudio.com/depot/nfc-shield-p-916.html?cPath=132_134) that will provide the communication with the chipset. Total cost for this rapid prototype is expected to be approximately $100.

Once we have the hardware integrated and succesfully communicating with the phone, we will then begin writing a small Android application to handle parsing NFC data and commands to and from the library. We intend to be as hands-off with the data and commands as we can be, relying on Google's code to handle the relevant processing.

Primary contributors to this project are Matthew Lichtenberger (JousterL@gmail.com) and Zach Tibbits (zachtib@gmail.com).