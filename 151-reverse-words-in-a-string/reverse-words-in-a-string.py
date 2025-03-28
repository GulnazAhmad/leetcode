class Solution:
    def reverseWords(self, s: str) -> str:
        new=s.split()
        news=new[::-1]
        s=" ".join(news)
        return s       


        