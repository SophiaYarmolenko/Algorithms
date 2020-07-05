#include <iostream>
#include "CLA.h"
#include "Trie.h"
#include <fstream>
using namespace std;


int main()
{
    string command;
    CLA cla;
    Trie trie;
    trie.clear();
    trie.addCommand("help", cla.help);
    trie.addCommand("quit", cla.quit);
    trie.addCommand("exit", cla.Exit);
    trie.addCommand("save", cla.save);
    trie.addCommand("load", cla.load);
    trie.addCommand("logfile", cla.logFile);
    trie.addCommand("list", cla.list);
    trie.addCommand("logOn", cla.logOn);
    trie.addCommand("logOff", cla.logOff);
    trie.addCommand("logAppend", cla.logAppend);
    trie.addCommand("logNew", cla.logNew);
    trie.addCommand("logClearHistory", cla.logClearHistory);
    cla.greeting();
    while(1)
    {
        cout<<"Please, choose what command do you want\n";
        cin>>command;
        trie.DoFunction(command);
    }
    return 0;
}
