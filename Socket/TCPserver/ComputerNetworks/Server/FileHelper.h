#include<stdio.h>
#include <WINSOCK2.H>
#include <STDIO.H>
#include<direct.h>    //ͷ�ļ�  
#include<io.h> 
#pragma  comment(lib,"ws2_32.lib")

class FileHelper
{
private:
	FILE *f;
public:
	FILE * selectfile()
	{
		printf("������Ҫ���͵��ļ���\n");
		char name[100];
		scanf("%s", name);
		if (f = fopen(name, "r"))
		{
			printf("�ļ��򿪳ɹ�\n");
			return f;
		}
		else
		{
			printf("�ļ������ڣ�����������\n");
			return selectfile();
		}
	}

	FILE * createFile(char *name)
	{
		remove(name);
		if (f = fopen(name, "ab"))
		{
			printf("�ļ������ɹ�\n");

		}
		else
		{
			printf("�ļ�����ʧ��\n");
		}
		return f;
	}

	bool createDir(char *dir)
	{
		char head[MAX_PATH] = "md ";
		return system(strcat(head, dir));
	}


};