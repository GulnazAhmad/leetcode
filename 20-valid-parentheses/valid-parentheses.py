class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for i in s:
            if i=='(' or i=='[' or i=='{':
                stack.append(i)
            else:
                if not stack:#if stack is empty and that means () is over so for [] to start there will be [ already in stack
                    return False
                top=stack.pop()
                if i==')' and top!='(':
                    return False
                elif i==']' and top!='[':
                    return False
                elif i=='}' and top!='{':
                    return False
        if len(stack)==0:
            return True
        return False

                

        