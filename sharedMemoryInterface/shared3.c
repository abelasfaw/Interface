
#include<stdio.h>
#include<stdlib.h>
#include<sys/ipc.h>
#include<sys/shm.h>
#include<sys/types.h>

int main(){
	key_t key= 5678;
	int sid ,count ;
	int *ref;
	if((sid = shmget(key , 5*(sizeof(int)) , 0666))  < 0) {
	printf("shmget error");
	exit(1);
	}
	if((ref = shmat(sid,NULL,0)) == (int *) -1){
	printf("shmat error");
	exit(1);
	}
    printf("data read from shared memory \n");
	for(count =0 ; count <5 ; count ++){
	printf("data %d : %d \n"  , count , ref[count]);
	}
    for(count =0 ; count <5 ; count ++){
	//printf("arr[%d]==%d \n"  , count , ref[count]);
    ref[count] = count *100;
	}
    printf("data written to shared memory new values are \n");
	 for(count =0 ; count <5 ; count ++){
	printf("data %d : %d \n"  , count , ref[count]);
    
	}

return 0;
}
