# ENOCA CHALLENGE CODING (SEZER TURKMEN)
 <h3>SORU</h3>
Local database kurulumu (mysql, postgresql veya herhangi bir database)
- Java spring uygulaması ayağa kaldırılması,
- İki adet tablo yer alamalı ve bu tabloların birbirleriyle bağı olmalıdır. (Örn: şirket ve çalışan
  gibi),
- Java spring uygulamasında ekleme,silme,güncelleme,listeleme gibi servisler yer almalıdır ve
  responseda yapılan işlem detayı return edilmelidir.
- Ekleme,silme,güncelleme,listeleme işlemlerini postman vb ile işlem yapılabilmelidir.
  Bu adımlar sırasıyla izlenip java uygulaması üzerinden database’ e kayıt atılmalı (Herhangi
  bir kayıt olabilir fark etmez. Database'de bir tablo açılıp o tabloya değer girilmesi java isteği
  üzerinden). Daha sonra aynı istek atılan uygulama ile (örnek postman ...) get ve list java
  spring endpointleri çağırılarak, database e atılan kayıt response olarak dönülmeli.
- MVC deki model ve kontroller akışının güzel kurgulanması ve uygulama ayağı nasıl
  kaldırılıp servislerin nasıl kullanıldığına dair bir döküman hazırlanmalıdır. Bu proje için
  kaynak kodu ile iletilmesi gerekmektedir.

<h3>UYGULAMA KULLANMA ACIKLAMASI</h3>

DATABASE: POSTGRESQL  ---> DATABASE ADI: <strong>EnocaDB</strong>

LOCALHOST:           ---> SERVER PORT: <strong>9080</strong>

API KONTROL:         ---> SWAGGER <link>http://localhost:9080/swagger-ui/index.html#/


- Uygulamanın ayağa kalkabilemesi için gerekli database işlemleri için localhost daki postgresql üzerinde
  'EnocaDB' adında database oluşturulması gereklidir.Uygulama ayağa kalktığında otomatik olarak örnek bazı
  bilgiler database aktarılmaktır.(DataImpl)

- Uygulamada Model(entity) olarak Employee ve Company oluşturulmuştur.Bu iki model ManyToOne ilişki olarak
  Her bir şirketin bir den fazla elemanı olacak şekilde birbiri üzerinden 'company_id' ile bağlanmıştır.


- Her modellin kendi Controllerları mevcuttur.Bir Employee oluşturulması için öncelikle Company yaratılması
  gerekmektedir. Company oluşturulması sonucu dönen Response dto daki id ile Employee oluşturma işlemi 
  gerçekleştirilebilir. Sistem içinde çalışanların bulunduğu şirketin silinmesine izin vermemektedir.


- Controller daki tüm ekleme,silme,güncelleme ve listeleme işlemleri için DTO objeleri kullanılmıştır.


- Uygulamanın API lerini kontrol edilmesi için Swagger kullanılmış ve gerekli bağımlıkları uygulama içine
  eklenmiştir.Postman ile kullanılabileceği gibi ayrıca yukarı da API kontrol linki üzerinden de gerekli
  test işlemleri yapılabilmektedir.


  