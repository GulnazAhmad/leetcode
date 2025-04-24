class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        maps={}
        mapsie={}
        for i in s:
            if i not in maps:
                maps[i]=1
            else:
                maps[i]+=1
        for i in t:
            if i not in mapsie:
                mapsie[i]=1
            else:
                mapsie[i]+=1
        if(maps==mapsie):
            return True
        return False
        