//
// Created by Sophia on 20.05.2020.
//

#include "History.h"
bool History::on_of = false;
bool History::clear = false;
//ofstream History::file("history.txt");

vector <string> History::history = {};

History::History()
{
    //file.open("history.txt");

    on_of = 0;
    clear = 0;
}

void History::setOnOf(bool onOf)
{
    on_of = onOf;
}

void History::setClear(bool clear)
{
   clear = clear;
}

void History::PushBack(string command)
{
    if(on_of == 1)
    {
        if( clear == 1 )
        {
            history.clear();
//            file.clear();
            history.push_back(command);
        }
        else
            history.push_back(command);
    }
}
void History::Clear()
{
    history.clear();
    fstream file;
    file.open("history.txt", fstream::app);
    file.clear();
    file.close();
}

void History::Save()
{
    fstream file;
    if(!clear)
    {
        file.open("history.txt", fstream::app);
    }
    else
        {
           file.clear();
           file.open("history.txt", fstream::out);
        }

    for(string s:history)
    {
       file<<s<<"\n";
    }
    history.clear();
}
void History::Show()
{
    for(string s:history)
    {
        cout<<s<<"\n";
    }
}

