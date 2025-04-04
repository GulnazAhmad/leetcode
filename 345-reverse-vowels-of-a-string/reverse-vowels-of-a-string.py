class Solution:
    def reverseVowels(self, s: str) -> str:
        l={}
        for i in range(len(s)):
            if(s[i] in ['a','A','e','E','i','I','o','O','u','U']):
                l[i]=s[i]
        print (l)
        value_list=list(l.values())#list
        rev_value_list=value_list[::-1] #list reversed
        i=0
        listi=list(s)
        for key,value in l.items():
            listi[key]=rev_value_list[i]
            i+=1
        s="".join(listi)
        return s
            


        