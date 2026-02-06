package Pro;

public class Product<E> {
    private Node head;
    private int numNodes;

    public Product() {

    }

    public Product(int numNodes) {
        head = null;
        numNodes = 0;
    }
    // thêm
    public void add(int index, E element) {
        Node newNode = new Node(element);
        Node temp = head;
        Node holder;
        if (index == 0 || head == null) {
            newNode.next = head;
            head = newNode;
            numNodes++;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = newNode;
            temp.next.next = holder;
            numNodes++;
            System.out.println("Da them thanh cong phan tu moi vao vi tri index: " + index);
        }
    }

    // kiểm tra rỗng
    public boolean isEmpty() {
        return head == null;
    }
    // xóa
    public void remove(int index) {
        Node temp = head;
        // kiểm tra rỗng
        if (isEmpty()) {
            System.out.println("Danh sach rong, khong the xoa");
            return;
        }
        // kiểm tra điều kiện xóa hợp lệ
        if (index < 0 || index >= numNodes) {
            System.out.println("Khong ton tai phan tu can xoa");
            return;
        }
        // xóa tại vị trí đầu
        if (index == 0) {
            head = temp.next;
            numNodes--;
            System.out.println("Xoa thanh cong phan tu vi tri index: " + index);
        }
        // xóa tại ví trí index bất kỳ
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
            numNodes--;
            System.out.println("Xoa thanh cong phan tu vi tri index: " + index);
        }
    }

    // sửa
    public E set(int index, E element) {
        if (isEmpty()) {
            System.out.println("Danh sach rong, khong the sua");
            return null;
        }

        if (index < 0 || index >= numNodes) {
            System.out.println("Vi tri khong hop le");
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }

        if (temp != null) {
            E oldData = (E) temp.getData();
            temp.setData(element);
            System.out.println("Sua thanh cong phan tu tai vi tri index: " + index);
            return oldData;
        }

        return null;
    }

    // hiển thị danh sách
    public void display() {
        if (isEmpty()) {
            System.out.println("Danh sach rong");
            return;
        }

        Node temp = head;
        int i = 0;
        System.out.println("Danh sach:");
        while (temp != null) {
            System.out.println("Phan tu thu " + i + ": " + temp.getData());
            temp = temp.next;
            i++;
        }
    }

    // lấy số lượng phần tử
    public int size() {
        return numNodes;
    }
}
