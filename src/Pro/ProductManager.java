package Pro;

import java.util.Scanner;

public class ProductManager<E> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product<Object> list = new Product<>();
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them phan tu");
            System.out.println("2. Xoa phan tu");
            System.out.println("3. Sua phan tu");
            System.out.println("4. Hien thi danh sach");
            System.out.println("5. Kiem tra rong");
            System.out.println("6. Lay so luong phan tu");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine(); // Xóa bộ đệm

            switch (choice) {
                case 1:
                    // Thêm phần tử
                    System.out.print("Nhap vi tri can them: ");
                    int addIndex = sc.nextInt();
                    sc.nextLine(); // Xóa bộ đệm
                    System.out.print("Nhap phan tu can them: ");
                    String addElement = sc.nextLine();
                    list.add(addIndex, addElement);
                    break;

                case 2:
                    // Xóa phần tử
                    System.out.print("Nhap vi tri can xoa: ");
                    int removeIndex = sc.nextInt();
                    sc.nextLine(); // Xóa bộ đệm
                    list.remove(removeIndex);
                    break;

                case 3:
                    // Sửa phần tử
                    System.out.print("Nhap vi tri can sua: ");
                    int setIndex = sc.nextInt();
                    sc.nextLine(); // Xóa bộ đệm
                    System.out.print("Nhap gia tri moi: ");
                    String setElement = sc.nextLine();
                    Object oldValue = list.set(setIndex, setElement);
                    if (oldValue != null) {
                        System.out.println("Gia tri cu: " + oldValue);
                    }
                    break;

                case 4:
                    // Hiển thị danh sách
                    list.display();
                    break;

                case 5:
                    // Kiểm tra rỗng
                    if (list.isEmpty()) {
                        System.out.println("Danh sach rong");
                    } else {
                        System.out.println("Danh sach khong rong");
                    }
                    break;

                case 6:
                    // Lấy số lượng phần tử
                    System.out.println("So luong phan tu: " + list.size());
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;

                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (choice != 0);

        sc.close();
    }
}
