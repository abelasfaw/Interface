#include<stdio.h>
#include<stdlib.h>
#include<sys/ipc.h>
#include<sys/shm.h>
#include<sys/types.h>
int main(){
	key_t key = 5678;

	int sid;
	int *ref , count;
	
	if((sid=shmget(key , 5*(sizeof(int)) , IPC_CREAT |0666)) <0) {
	printf("memeory segment error");
	exit(1);
	}
	if((ref = shmat(sid ,NULL, 0)) == (int *) -1) {
	printf("shmat error");
	exit(1);
	}
	printf("segment with id %d:created" , sid);
    
	for(count =0 ;count<5 ;count++){
	ref[count] = (count +5);
	}
    printf("data written to segment \n");
    for(count =0 ;count<5 ;count++){
    printf("data %d: %d \n" , count , ref[count] );
	}
    

	return 0;
}



