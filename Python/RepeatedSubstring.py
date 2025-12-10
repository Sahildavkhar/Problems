class RepeatedSubstring:
    def repeatedSubstringPattern(self, s: str) -> bool:
        return s in (s + s)[1:-1]