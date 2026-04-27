package pekan4_2511532007;

public class QueueArrayDriver_2511532007 {

	public static void main(String[] args) {
		QueueArray_2511532007 queue = new QueueArray_2511532007(1000);
		queue.enqueue_2007(10);
		queue.enqueue_2007(20);
		queue.enqueue_2007(30);
		queue.enqueue_2007(40);
		System.out.println("Item di depan " + queue.front_2007());
		System.out.println("Item paling belakang " + queue.rear_2007());
		System.out.println("Tampilan Queue " );
		queue.display_2007();
		System.out.println();
		System.out.println(queue.dequeue_2007() + "dihapus dari queue");
		System.out.println("Item di depan " + queue.front_2007());
		System.out.println("Item paling belakang " + queue.rear_2007());
		System.out.println("Tampilan Queue setelah satu data dihapus");
		queue.display_2007();
	}
}
