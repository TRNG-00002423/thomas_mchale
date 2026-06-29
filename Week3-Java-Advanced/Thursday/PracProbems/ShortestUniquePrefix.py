numWords = int(input())
listWords = []

prefixDict = {}

for i in range(numWords):
    listWords.append(input())


for word in listWords:
    curPrefix = ""
    index = 0
    uniquePrefix = False
    while not uniquePrefix:
        curPrefix += word[index]
        issue = False
        for prefix, dictWord in list(prefixDict.items()): 
            if (prefix.startswith(curPrefix)):
                issue = True                    
                while(dictWord.startswith(curPrefix) and index < len(dictWord) - 1 and index < len(word) - 1):
                    index += 1
                    curPrefix += word[index]
                
                prefixDict[word[:index+1]] = word
                uniquePrefix = True
                break
        if not issue:
            prefixDict[word[0]] = word
            uniquePrefix = True
        
for word in listWords:
    for prefix, dictWord in prefixDict.items():
        if dictWord == word:
            print(prefix)
            break
