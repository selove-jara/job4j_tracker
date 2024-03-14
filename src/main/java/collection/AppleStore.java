package collection;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        for (int i = 0; i < queue.size(); i++) {
            if (i < count - 1) {
                queue.poll();
            }
        }
        return queue.peek().name();
    }

    public String getFirstUpsetCustomer() {
        for (int i = 0; i < queue.size(); i++) {
            if (i < count + 1) {
                queue.poll();
            }
        }
        return queue.peek().name();
    }
}