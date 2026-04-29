package pekan4_2511532007;

public class Queue_2511532007 {
    int front_2007;
    int rear_2007;
    int max_2007;
    String queue_2007[];

    public Queue_2511532007(int max_2007) {
        this.max_2007 = max_2007;
        queue_2007 = new String[max_2007];
        front_2007 = -1;
        rear_2007 = -1;
    }

    boolean isEmpty_2007() {
        return rear_2007 == -1;
    }

    boolean isFull_2007() {
        return rear_2007 == max_2007 - 1;
    }

    void enqueue_2007(String data_2007) {
        if (isFull_2007()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty_2007()) {
                front_2007 = 0;
            }
            rear_2007++;
            queue_2007[rear_2007] = data_2007;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    void dequeue_2007() {
        if (isEmpty_2007()) {
            System.out.println("Antrian kosong!");
        } else {
            String keluar_2007 = queue_2007[front_2007];
            System.out.println(keluar_2007 + " telah dilayani");

            if (front_2007 == rear_2007) {
                front_2007 = -1;
                rear_2007 = -1;
            } else {
                front_2007++;
            }
        }
    }

    void display_2007() {
        if (isEmpty_2007()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Isi antrian:");
            for (int i_2007 = front_2007; i_2007 <= rear_2007; i_2007++) {
                System.out.println((i_2007 - front_2007 + 1) + ". " + queue_2007[i_2007]);
            }
        }
    }

    void reverse_2007() {
        if (isEmpty_2007()) {
            System.out.println("Antrian kosong");
        } else {
            int start_2007 = front_2007;
            int end_2007 = rear_2007;

            while (start_2007 < end_2007) {
                String temp_2007 = queue_2007[start_2007];
                queue_2007[start_2007] = queue_2007[end_2007];
                queue_2007[end_2007] = temp_2007;

                start_2007++;
                end_2007--;
            }
            System.out.println("Antrian berhasil dibalik");
        }
    }
}
