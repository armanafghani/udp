import socket
import time

UDP_IP = "131.179.42.52"
UDP_PORT = 5555
message = "1001|10001|100001"


sock = socket.socket(socket.AF_INET, # Internet
                     socket.SOCK_DGRAM) # UDP

while (1):
	print message
	time.sleep(1)
	sock.sendto(message, (UDP_IP, UDP_PORT))



