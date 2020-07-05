//
// Created by Sophia on 28.05.2020.
//

#ifndef CLL_TRIE_H
#define CLL_TRIE_H
#include <iostream>
#include <assert.h>

using namespace std;

class Trie
{
    class TrieNode
    {
    public:
        int ENG_LET = 500;
        TrieNode* sons[500];
        int strsInBranch;
        bool isEndOfStr;
        void (*fcnPtr)();



        TrieNode(bool _isEndOfStr = false):isEndOfStr(_isEndOfStr), strsInBranch(0)
        {
            for(int i=0; i<ENG_LET; ++i)
            {
                sons[i] = NULL;
            }
        }

        ~TrieNode()
        {
            for(int i=0; i<ENG_LET; ++i)
            {
                delete sons[i];
                sons[i] = NULL;
            }
        }
    };

    TrieNode* head;

public:
    Trie();
    ~Trie();

    bool isExists(const string s);
    void addCommand(const string& s, void (&f)());
    void removeString(const string& s);
    void clear();
    void DoFunction(const string& s);
};

#endif //CLL_TRIE_H
