import socket

UDP_IP = "255.255.255.255"
UDP_PORT = 5555

sock = socket.socket(socket.AF_INET, # Internet
                     socket.SOCK_DGRAM) # UDP

sock.setsockopt(socket.SOL_SOCKET, socket.SO_BROADCAST, 1)


message = "hey"

while (1):
	print message
	sock.sendto(message, (UDP_IP, UDP_PORT))



