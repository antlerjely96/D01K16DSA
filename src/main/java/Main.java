public class Main {
    public static void main(String[] args) {
        /*
            Biến (Variable): lưu trữ dữ liệu được lấy từ bàn phím (người dùng nhập) hoặc từ chương trình trả về
                - Đặc điểm:
                    + Duy nhất
                    + Mỗi biến có 1 kiểu dữ liệu xác định
                - Khai báo biến
                    + Khai báo biến và không gán giá trị
                        <kiểu_dữ_liệu> <tên_biến>;
                    + Khai báo biến và gán giá trị
                        <kiểu_dữ_liệu> <tên_biến> = <giá_trị>;
                - Quy tắc đặt tên biến
                    + Chỉ chứa chữ cái, chữ số, _
                    + Không bắt đầu bằng số
                    + Không trùng từ khóa
                    + Phân biệt hoa thường

            Kiểu dữ liệu (Datatype): thể hiện kiểu, miền giá trị mà biến lưu được
                - 1 số kiểu dữ liệu
                    int: số nguyên
                    float, double: số thực
                    char: ký tự
                    string: chuỗi
                    boolean: True hoặc False

            Từ khóa (Keyword): những từ được xây dựng sẵn trong ngôn ngữ lập trình
                - Đặc điểm
                    + Mỗi keyword có 1 chức năng xác định
                    + Không thể thay đổi chức năng của keyword

            Toán tử (Operator): ký hiệu thể hiện cho các phép toán
                - 1 số loại toán tử
                    + Toán tử số học: +, -, *, /, %, ++, --
                    + Toán tử quan hệ: >, <, >=, <=, ==, !=
                    + Toán tử logic: &&, ||, !
                    + Toán tử gán: =, +=, -=, *=, /=, %=
                    + Toán tử ? :

            Cấu trúc điều khiển rẽ nhánh (Condition): Thực hiện 1 khối lệnh dựa theo 1 điều kiện được thỏa mãn
                if(condition){
                    code block;
                }

                if(condition){
                    code block 1;
                } else {
                    code block 2;
                }

                if(condition 1){
                    code block 1;
                } else if (condition 2){
                    code block 2;
                } ...
                else {
                    condition n;
                }

                if(condition 1){
                    if(condition 2){
                        code block;
                    }
                }

            Vòng lặp (Loop): thực hiện 1 khối lệnh nhiều lần
                - for
                    for(tham số 1; tham số 2; tham số 3){
                        code block;
                    }
                - while
                    tham số 1;
                    while(tham số 2){
                        code block;
                        tham số 3;
                    }
                - do - while
                    + Biết tham số 1 là gì
                        tham số 1;
                        do {
                            code block;
                            tham số 3;
                        } while (tham số 2);
                    + Chưa biết chính xác tham số 1 là gì
                        do {
                            tham số 1;
                            code block;
                            tham số 3;
                        } while (tham số 2)

                Tham số 1: Thời điểm bắt đầu vòng lặp => xác định khi nào vòng lặp bắt đầu
                Tham số 2: Điều kiện duy trì vòng lặp => xác định khi nào vòng lặp bị dừng lại
                Tham số 3: Bước nhảy của vòng lặp => xác định thời điểm bắt đầu của vòng lặp tiếp theo

                - Sự khác biệt giữa for, while, do - while
                    + for:
                        . Dùng được khi biết trước số lần lặp
                        . Kiểm tra trước, thực hiện sau: kiểm tra tham số 2 trước, sau đó mới thực hiện code block => for có thể chạy 0 hoặc n lần
                    + while
                        . Dùng được khi biết trước hoặc không biết trước số lần lặp
                        . Kiểm tra trước, thực hiện sau: kiểm tra tham số 2 trước, sau đó mới thực hiện code block => while có thể chạy 0 hoặc n lần
                    + do - while
                        . Dùng được khi biết trước hoặc không biết trước số lần lặp
                        . Thực hiện trước, kiểm tra sau: thực hiện code block trước, sau đó mới kiểm tra tham số 2 => do - while luôn thực hiện ít nhất 1 lần

                - for : => tương tự foreach trong PHP
                    for(<kiểu_dữ_liệu_hoặc_tên_class> <tên_biến> : <Danh_sách_hoặc_mảng>){
                        code block;
                    }

            Mảng (Array): 1 tập hợp các phần tử có cùng kiểu dữ liệu
                - Đặc điểm
                    + Có số lượng phần tử xác định
                    + Các phần tử phải có cùng kiểu dữ liệu
                    + Các phần tử được phân biệt bằng index
                    + Index bắt đầu từ 0 -> n - 1 (n là số phần tử của mảng)
                - Khai báo mảng
                    + Khai báo và không gán giá trị cho phần tử
                        <kiểu_dữ_liệu>[] <tên_mảng> = new <kiểu_dữ_liệu>[<số_phần_tử>];
                    + Khai báo và gán giá trị cho phần tử
                        <kiểu_dữ_liệu>[] <tên_mảng> = {<giá_trị_1>, <giá_trị_2>, ...};
                - Truy xuất phần tử
                    <tên_mảng>[<index>]
                - Truy xuất lần lượt từng phần tử của mảng: dùng vòng lặp chạy theo index

            Phương thức (method): thực hiện 1 chức năng của chương trình
                - Khai báo
                    <access_modifier> <kiểu_dữ_liệu> <tên_method>(<Kiểu_dữ_liệu> <tên_tham_số_1>, ...){
                        code block;
                        return <giá_trị_có_kiểu_dữ_liệu_giống_kiểu_dữ_liệu_của_method>;
                    }
                - Gọi method
                    <tên_method>(<tên_đối_số_1>, ...);
                Lưu ý khi gọi method:
                    + Truyền số lượng đối số = số lượng tham số
                    + Kiểu dữ liệu của đối số = kiểu dữ liệu của tham số tương ứng
         */

        /*
            OOP (Object-oriented programming - Lập trình hướng đối tượng): là cách lập trình mô phỏng 1 đối tượng ngoài thực tể
                - Lớp (class): khuôn mẫu để thể hiện các thông tin (thuộc tính), hành vi (phương thức) của 1 tập hợp các đối tượng
                    + Khai báo class
                        public class <tên_class>{
                            <access_modifier> <Kiểu_dữ_liệu> <tên_thuộc_tính>;
                            <access_modifier> <kiểu_dữ_liệu> <tên_method>(<Kiểu_dữ_liệu> <tên_tham_số_1>, ...){
                                code block;
                                return <giá_trị_có_kiểu_dữ_liệu_giống_kiểu_dữ_liệu_của_method>;
                            }
                        }
                - Đối tượng (Object): 1 thể hiện cụ thể của class
                    + Khởi tạo object
                        <Tên_class> <Tên_object> = new <tên_class>();
                    + Khởi tạo 1 mảng các đối tượng của 1 class
                        . Khai báo mảng đối tượng: <Tên_class>[] <tên_mảng> = new <tên_class>[<số_phần_tử>];
                        . Khởi tạo mỗi phần tử là 1 đối tuượng
                - Tính chất của OOP
                    + Tính kế thừa (Inheritance): 1 class có thể kế thừa các thuộc tính, phương thức của 1 class khác
                        . Class con có tất cả các thuộc tính, phương thức của class cha, class con có thể có 1 số thuộc tính, phương thức mà class cha không có
                        . 1 class cha có nhiều class con, 1 class con có 1 class cha
                        . Cú pháp
                            public class <tên_class_con> extends <tên_class_cha> {
                                Thuộc tính;
                                Phương thức;
                            }
                    + Tính đa hình (Polymorphism): 1 method có thể được triển khai khác nhau bởi các class khác nhau
                        . Nạp chồng (Overload): trong 1 class có các phương thức giống tên, khác tham số
                        . Ghi đè (Override): trong class cha, con có 1 phương thức giống tên, tham số
                    + Tính đóng gói (Encapsulation): phạm vi truy cập của 1 thuộc tính, phương thức trong 1 class
                        . public: truy cập từ mọi class khác trong project
                        . private: chỉ có thể truy cập từ chính class đó
                            Thuộc tính private muốn truy cập được thì phải thông qua getter, setter
                        . protected: có thể truy cập từ các class con (bất kể trong hay ngoài package)
                        . default: có thể truy cập từ các class trong cùng package
                    + Tính trừu tượng (Abstraction): thể hiện khung của chương trình, không thể hiện chi tiết bên trong
                        . Bán trừu tương - Abstract class: chứa thuộc tính, phương thức thông thường, phương thức trừu tượng
                            Khai báo
                                public abstract class <tên_class>{
                                    <access_modifier> <Kiểu_dữ_liệu> <tên_thuộc_tính>;
                                    <access_modifier> <kiểu_dữ_liệu> <tên_method>(<Kiểu_dữ_liệu> <tên_tham_số_1>, ...){
                                        code block;
                                        return <giá_trị_có_kiểu_dữ_liệu_giống_kiểu_dữ_liệu_của_method>;
                                    }
                                    <access_modifier> abstract <kiểu_dữ_liệu> <tên_method>(<tham_số>);
                                }
                        . Trừu tượng toàn phần - Interface: phương thức trừu tượng
                            Khai báo
                                public interface <tên_interface>{
                                    <access_modifier> abstract <kiểu_dữ_liệu> <tên_method>(<tham_số>);
                                }
                        . Lưu ý:
                            * Các class kế thừa abstract class hoặc implement interface thì bắt buộc phải override các abstract method
                            * Không thể khởi tạo đối tượng cho abstract class, interface

                - Constructor: là 1 phương thức đặc biệt có tên trùng với tên của class, được dùng để khởi tạo đối tượng
                    + Constructor không có tham số
                        Khai báo
                            <access_modifier> <tên_class>(){
                                code block;
                            }
                    + Constructor có tham số
                        Khai báo
                            <access_modifier> <tên_class>(<tham_số_1>, <tham_số_2>, ...){
                                code block;
                            }
                    + Lưu ý:
                        Mặc định trong class có constructor không có tham số, tuy nhiên khi khai báo 1 constructor có tham số => constructor không có tham số biến mất
                            => muốn dùng constructor không có tham số thì phải khai báo lại
         */

        /*
            1.	Xây dựng hệ thống quản lý nhân sự cơ bản
            a.	Viết Class cơ sở có tên là NhanVien (Employee). Lớp này phải có các trường dữ liệu private sau: MaSo (string), HoTen (string), và LuongCoBan (double). Tạo các properties công khai (public) để truy cập và thay đổi các trường dữ liệu này một cách hợp lý. Cài đặt một Constructor cho phép khởi tạo đối tượng với đủ 3 thông tin trên.
            b.	Viết Class NhanVienChinhThuc (FullTimeEmployee) kế thừa từ lớp NhanVien. Thêm một trường dữ liệu private mới cho lớp con là Thuong (Bonus - double) và một property công khai tương ứng.
            c.	Định nghĩa một Interface có tên là IInThongTin (IPrintable) với một phương thức công khai duy nhất: InChiTiet() (PrintDetails) không có tham số và không trả về giá trị. Thực thi (Implement) interface IInThongTin cho lớp NhanVienChinhThuc. Phương thức InChiTiet() phải in ra màn hình tất cả thông tin chi tiết (Mã số, Họ tên, Lương cơ bản, Thưởng) của nhân viên đó.
            d.	Trong lớp cơ sở NhanVien, định nghĩa một phương thức virtual tên là TinhLuongThucLinh() (CalculateActualSalary) trả về double. Phương thức này mặc định trả về LuongCoBan. Trong lớp NhanVienChinhThuc, ghi đè (override) phương thức TinhLuongThucLinh() để tính toán tổng lương thực lĩnh bao gồm LuongCoBan cộng với Thuong.
            e.	Viết một Class CongTy (Company) chứa một List (hoặc Collection tương đương) các đối tượng thuộc kiểu NhanVien. Cài đặt một phương thức TinhTongLuongPhaiTra() (CalculateTotalSalary) trong lớp CongTy để duyệt qua toàn bộ danh sách nhân viên và sử dụng tính năng Đa hình (Polymorphism) để tính và trả về tổng lương thực lĩnh (sử dụng phương thức TinhLuongThucLinh()) cho tất cả nhân viên trong công ty.
            f.	Trong hệ thống, cần áp dụng mức thuế khác nhau cho từng loại nhân viên (ví dụ: Nhân viên chính thức có thuế 10%, nhân viên thời vụ có thuế 5%). Yêu cầu sinh viên không được thay đổi cấu trúc của lớp NhanVien hiện tại. Sử dụng Abstract Class (hoặc Interface nâng cao) và áp dụng một mẫu thiết kế (ví dụ: Strategy Pattern đơn giản) để tính toán Tiền Thuế của một nhân viên, sau đó điều chỉnh phương thức TinhTongLuongPhaiTra() trong lớp CongTy.
                i.	Định nghĩa một Abstract Class (hoặc Interface) có tên ThueStrategy (TaxStrategy) với một phương thức trừu tượng TinhTienThue(double luong)
                ii.	Tạo hai lớp dẫn xuất cụ thể (ví dụ: ThueNVCThuc và ThueNVThoiVu) để thực thi logic tính thuế riêng (10% và 5%).
                iii.	Cập nhật lớp NhanVien để chứa một thuộc tính (property) ThueApDung kiểu ThueStrategy
                iv.	Cập nhật phương thức TinhTongLuongPhaiTra() trong lớp CongTy để nó truyền lương thực lĩnh của mỗi nhân viên vào ThueApDung của nhân viên đó để tính thuế, sau đó trừ đi tiền thuế đó để tính tổng lương ròng thực tế công ty phải chi trả.

            2.	Xây dựng hệ thống quản lý nhân sự cơ bản
            a.	Viết Class cơ sở có tên là TaiKhoan (Account). Lớp này phải có các trường dữ liệu private sau: SoTaiKhoan (string), TenChuTaiKhoan (string), và SoDu (decimal). Tạo các properties công khai (public) có chế độ chỉ đọc (get only) cho các trường trên (trừ SoDu có thể thay đổi nhưng phải được quản lý nội bộ). Cài đặt một Constructor cho phép khởi tạo đối tượng với đủ 3 thông tin trên (lưu ý: SoDu ban đầu phải >= 50000 VND).
            b.	Viết Class TaiKhoanTietKiem (SavingsAccount) kế thừa từ lớp TaiKhoan. Thêm một trường dữ liệu private mới cho lớp con là LaiSuat (InterestRate - double). Thêm một property công khai tương ứng cho LaiSuat.
            c.	Định nghĩa một Interface có tên là IGiaoDich (ITransactable) với hai phương thức công khai sau:
            i.	NapTien(decimal soTien): Trả về bool (Thành công/Thất bại). Phương thức này luôn thành công và cộng vào SoDu
            ii.	RutTien(decimal soTien): Trả về bool (Thành công/Thất bại). Thực thi (Implement) interface IGiaoDich cho lớp TaiKhoan. Phương thức này chỉ thành công nếu SoDu hiện tại >= soTien và sau đó trừ đi soTien.
            d.	Trong lớp cơ sở TaiKhoan, định nghĩa một phương thức virtual tên là InThongTin() (PrintInfo) không có tham số và không trả về giá trị (hoặc trả về string). Phương thức này in ra (hoặc trả về) thông tin cơ bản (Số TK, Tên, Số dư). Trong lớp TaiKhoanTietKiem, ghi đè (override) phương thức InThongTin() để in ra (hoặc trả về) thông tin cơ bản cộng thêm LaiSuat của tài khoản tiết kiệm.
            e.	Trong lớp TaiKhoanTietKiem, ghi đè (override) phương thức RutTien(decimal soTien) từ interface IGiaoDich.Áp dụng một phí rút tiền là $\text{5.000}$ VND cho mỗi lần rút tiền từ tài khoản tiết kiệm.Phương thức RutTien mới phải kiểm tra:
                i.	Số tiền rút + Phí <= SoDu
                ii.	Nếu thỏa mãn, trừ cả số tiền rút và phí khỏi SoDu và trả về true. Ngược lại, trả về false.
                f.	Yêu cầu xây dựng một lớp cho Giao Dịch Có Hạn Mức (Ví dụ: Tài khoản Vàng/Platinum). Loại tài khoản này có thể rút tiền tối đa 50.000.000 VND/lần.
                i.	Định nghĩa một Abstract Class có tên là TaiKhoanCoHanMuc (LimitedAccount) kế thừa từ TaiKhoan và thực thi interface IgiaoDich
                ii.	Trong lớp TaiKhoanCoHanMuc, ghi đè phương thức RutTien(decimal soTien) để kiểm tra: Nếu soTien > 50.000.000, phương thức phải ném ra (throw) một Custom Exception (ngoại lệ tự định nghĩa) có tên HanMucVuotQuaException (LimitExceededException). Ngoại lệ này phải có thông báo rõ ràng về việc vượt quá hạn mức.
                iii.	Trong hàm Main, viết một đoạn code thử gọi phương thức RutTien với số tiền > 50.000.000 của một đối tượng TaiKhoanCoHanMuc và sử dụng khối try-catch để bắt (catch) ngoại lệ HanMucVuotQuaException và in ra thông báo lỗi cho người dùng.

         */
    }
}
