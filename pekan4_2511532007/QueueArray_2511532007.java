package pekan4_2511532007;

public class QueueArray_2511532007 {
	int front_2007, rear_2007, size_2007;
	int capacity_2007;
	int array_2007[];
	
	public QueueArray_2511532007(int capacity_2007) {
		this.capacity_2007 = capacity_2007; 
		front_2007 = this.size_2007 = 0;
		array_2007 = new int[this.capacity_2007];
		}
	boolean isFull(QueueArray_2511532007 queue) {
		return (queue.size_2007 == queue.capacity_2007);
	}
	boolean isEmpty(QueueArray_2511532007 queue) {
		return (queue.size_2007 == 0);
	}
	void enqueue_2007(int item) {
		if (isFull(this))
			return;
		this.rear_2007 = (this.rear_2007 + 1) % this.capacity_2007;
		this.array_2007[this.rear_2007] = item;
		this.size_2007 = this.size_2007 + 1;
		System.out.println(item + " enqueued to queue");
	}
	int dequeue_2007 () {
	if (isEmpty(this))
	return Integer.MIN_VALUE;
	int item = this.array_2007[this.front_2007];
	this.front_2007 = (this.front_2007 + 1) % this.capacity_2007;
	this.size_2007 = this.size_2007 - 1;
			return item;
	}
	int front_2007() {
		if(isEmpty(this))
		return Integer.MIN_VALUE;
		return this.array_2007[this.front_2007];	
	}
	int rear_2007() {
		if(isEmpty(this))
			return Integer.MIN_VALUE;
			return this.array_2007[this.rear_2007];
	}
	//mencetak elemen antrian
	void display_2007() {
		int i_2007;
		if (front_2007 == rear_2007) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		//kunjungi dari belakang dan cetak
		for (i_2007 = front_2007; i_2007 < rear_2007; i_2007++) {
			System.out.printf("%d <-- ", array_2007[i_2007]);
		}
		return;
	}
	
 
}
