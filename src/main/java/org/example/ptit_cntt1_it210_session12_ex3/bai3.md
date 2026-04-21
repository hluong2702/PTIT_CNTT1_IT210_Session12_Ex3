Khi dùng application.properties
Lợi ích:
1. Tách cấu hình khỏi code (Separation of Concerns)
   Code chỉ xử lý logic
   Config để riêng → rõ ràng, sạch sẽ
2. Dễ thay đổi mà không cần sửa code
   hospital.name=Bệnh viện Việt Đức
Đổi tên chỉ sửa 1 dòng, không cần build lại code (trong nhiều trường hợp)

3. Hỗ trợ nhiều môi trường
   application-dev.properties, application-prod.properties
   Chỉ cần đổi profile là xong, không cần sửa code
4. Bảo mật tốt hơn
   Những thông tin như DB IP, password không nên hard-code
   Đưa vào config giúp quản lý tốt hơn
5. Chuẩn best practice của Spring
Spring Boot thiết kế sẵn để làm theo cách này 
Đi đúng framework = đỡ lỗi về sau