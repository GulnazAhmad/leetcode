class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        maps={}
        mapped=set()
        for i in range(len(s)):
            if(s[i] not in maps ):
                if(t[i] not in mapped):
                    maps[s[i]]=t[i]
                    mapped.add(t[i])
                else:
                    return False
            else:
                if(maps[s[i]]!=t[i]):
                    return False
        return True

        