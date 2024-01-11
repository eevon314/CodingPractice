##
##import re
##
##document = Document('(LOCAL)SSDD-SOB306_203001-0001')
##text = "[OVS-001], [OVS-002]"
##print(text)
##print document.findall(r'\[([^]]*)\', s)
                 
import re
txt = open('LOCALSSDD.txt', 'r')
txt_contents = txt.read()
pattern = r'(\[.+?\])'
req = re.findall(pattern, txt_contents)
print(req)



# import re
# import docx
# def main():
#     document = docx.Document('LOCALSSDD.docx')
#     document.save('test.docx')
#     contents = open('test.docx')
#     contents.read()
# pattern = r'(\[.+?\])'
# print(re.findall(pattern, document))