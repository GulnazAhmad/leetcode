class Solution:
    def frequencySort(self, s: str) -> str:
        maps={}
        for i in s:
            if i not in maps:
                maps[i]=1
            else:
                maps[i]+=1
        
        nmaps=dict(sorted(maps.items(),key=lambda item:item[1],reverse=True))
        x=""
        for key,value in nmaps.items():
            x=x+value*key
        return x

        