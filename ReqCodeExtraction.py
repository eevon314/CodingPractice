               
import re
txt = open('LOCALSSDD.txt', 'r') #here you have to convert the .docx file to .txt and use the latter as input
txt_contents = txt.read()
pattern = r'(\[.+?\])'
req = re.findall(pattern, txt_contents)
print(req) #they will be printed in one line, but this is easy to edit in Excel's Power Query or using SQL even
