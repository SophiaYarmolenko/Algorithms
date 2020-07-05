//
// Created by Sophia on 20.05.2020.
//

#include "CLA.h"

 void CLA::greeting()
{

    cout<<
        "Hi)\n"
        "Choose what command do you want\n"
        "For more details press \"help\"\n";
}

void CLA::help()
{
    PushBack(TimeToString()+" > help");
    cout<<
        "Commands:\n"
        "help - show instruction\n"//////////
        "quit - exit without save\n"//////////
        "exit - exit with save\n"///////////
        "save - save command history\n"/////////
        "load - open file with history\n"/////////////
        "logfile - show file name\n"/////////////
        "list - show your history\n"////////////
        "logOn - start record history\n"////////////
        "logOff - stop record history\n"///////////
        "logAppend - record your history to the back\n"/////////
        "logNew - clear and start record new history\n"/////////
        "logClearHistory - clear your history\n";///////////
}

void CLA::quit()
{
    PushBack(TimeToString()+" > quit");
    exit(0);
}

void CLA::logOn()
{
    setOnOf(1);
    PushBack(TimeToString()+" > logOn");
}

void CLA::logOff()
{
   PushBack(TimeToString()+" > logOff");
   setOnOf(0);
}

void CLA::logAppend()
{
    PushBack(TimeToString()+" > logAppend");
    setClear(0);
}

void CLA::logNew()
{
    PushBack(TimeToString()+" > logNew");
    setClear(1);
}
void CLA::save()
{
    PushBack(TimeToString()+" > save");
    Save();
}

void CLA::Exit()
{
    PushBack(TimeToString()+" > exit");
    Save();
    exit(0);
}

void CLA::load()
{
    PushBack(TimeToString()+" > load");
    WinExec("\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\" \"history.txt\"", SW_SHOWNORMAL);

}

void CLA::logFile()
{
    PushBack(TimeToString()+" > logFile");
    cout<<"C:\\Users\\Sophia\\Desktop\\CLL\\cmake-build-debug\\history.txt";
}

void CLA::list()
{
    PushBack(TimeToString()+" > list");
    Show();
    //очніше через це:я переплутала
}
void CLA::logClearHistory()
{
    PushBack(TimeToString()+" > logClearHistory");
    Clear();
}

string CLA::TimeToString()
{
    time_t now = time(nullptr);
    tm time = *std::localtime(&now);
    stringstream result;
    result << 1900 + time.tm_year << ".";  
    result << (time.tm_mon  < 9 ? "0": "") << 1 + time.tm_mon << ".";
    result << (time.tm_mday < 10? "0": "") << time.tm_mday << " ";
    result << (time.tm_hour < 10? "0": "") << time.tm_hour << ":";
    result << (time.tm_min  < 10? "0": "") << time.tm_min  << ":";
    result << (time.tm_sec  < 10? "0": "") << time.tm_sec;
    return result.str();
}

