import sys
import os
import datetime

print("The Platform is: "+sys.platform);
print("The Version is: "+sys.version);
print("The pwd is: "+os.getcwd());
os.environ
print(os.getenv('JAVA_HOME'));

print(datetime.date.today().day);
print(datetime.date.today().month);
print(datetime.date.today().year);
