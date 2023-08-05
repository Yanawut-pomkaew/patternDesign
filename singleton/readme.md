singleton เป็น design patterns ในกลุ่ม Creational patterns ที่เกี่ยวกับการออกแบบการสร้าง object ให้มีความยืดหยุ่น โดย singleton มีแนวคิดแบบการสร้าง object ตัวเดียวและเรียกใช้ผ่านตัวนั้นเอา 
เนื่องจากปกติเวลาเราสร้าง object เรามักจะสร้างผ่าน Constructor ซึ่งจะเป็นการสร้าง object 1 ครั้งต่อการเรียก ทำให้เมื่อเวลาผ่านไป มีการสร้างมากขึ้นก็จะมี object มากมายไปหมดซึ่งทำให้สับสนและเปลืองพื้นที่

singleton จะให้เราสร้าง Object ได้ครั้งเดียวผ่าน instance แล้วให้เรียกใช้ผ่านตัวนั้นตลอด ยกตัวอย่างให้เข้าใจง่าย ๆ เช่น 
ในหลักการของ singleton เวลาเราซื้อน้ำขวดมากิน เมื่อเรากินจนหมดแล้วเราอยากจะเติมน้ำ เราก็ควรจะเติมจากขวดที่เราเพิ่งกินหมดไป   เราไม่จำเป็นต้องซื้อขวดน้ำมาใหม่เพื่อกรอกน้ำ

ซึ่งจะช่วยในเรื่อง
- ไม่สับสน ดูแลง่าย : ถ้าเรามีขวดน้ำขวดเดียว เราจะจัดการได้ง่าย เปรียบเสมือนการจัดการกับ object หรือตัวแปรในโปรแกรม
- ไม่เปลืองพื้นที่ : ถ้าเรามีน้ำขวดเดียว เราจะใช้ช่องเก็บขวดน้ำน้อยกว่าเก็บขวดหลายขวดแน่ ๆ เปรียบเสมือนการสร้าง object ครั้งเดียวแล้วเรียกใช้เอา (คล้าย ๆ การสร้าง string แบบ literal ที่เอาค่าไปเก็บใน string pool)