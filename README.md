
# Школа QA_GURU. Поток 37. Дипломный проект. 
# Данный проект состоит из трех частей:
# 1. <a href="#part1-3"> UI-тест </a> [<img src="images/logo/onliner.png" alt="Логотип" width="100">](https://www.onliner.by/)

> Onliner.by — это крупнейший белорусский интернет-порта́л и онлайн-магазин
# 2. <a href="https://github.com/Vasili6666/Diplom2"> API-тест </a>[<img src="images/logo/jsonplaceholder.png" alt="Логотип" width="200">](https://jsonplaceholder.typicode.com/) 

> JSONPlaceholder — это фейковое REST API для тестирования и прототипирования.
# 3. <a href="https://github.com/Vasili6666/Diplom3"> Mobile-тест</a> [<img src="images/logo/SQL.png" alt="Логотип" width="50">](https://play.google.com/store/apps/details?id=randomappsinc.com.sqlpracticeplus&hl=ru)

> SQL Practice PRO — Мобильное приложение. Практические упражнения на языке SQL.

----
# В проекте применены следующие технологии и инструменты

<p align="center">  
<a href="https://github.com/allure-framework/allure2"> <img src="images/logo/Allure.svg" width="50" height="50" alt="Allure"></a>
<a href="https://qameta.io/"><img src="images/logo/Allure2.svg" width="50" height="50" alt="Allure TestOps"></a>
<a href="https://developer.android.com/"><img src="images/logo/AndroidStudio.png" width="50" height="50" alt="Android Studio"></a>
<a href="https://appium.io/docs/en/latest/"><img alt="Appium" height="50" src="images/logo/appium.png" width="50"/></a> 
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://www.jetbrains.com/idea/"><img alt="IDEA" height="50" src="images/logo/Intelij_IDEA.svg" width="50"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a> 
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://projectlombok.org/"><img src="images/logo/lombok.jpg" width="50" height="50"  alt="lombok"/></a>  
<a href="https://rest-assured.io/"><img src="images/logo/Rest-assured.png" width="50" height="50"  alt="Rest-assured"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a> 
<a href="https://telegram.org"><img src="images/logo/Telegram.svg" width="50" height="50"  alt="Telegram"/></a> 
</p>

____
<a id="part1-3"></a>
# Часть 1/3
#  UI-тест [<img src="images/logo/onliner.png" alt="Логотип" width="100">](https://www.onliner.by/)


## **Содержание:**
____



* <a href="#cases">Примеры автоматизированных тест-кейсов</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#jira">Интеграция с Jira</a>

* <a href="#testops">Интеграция с Allure TestOps</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>

____
<a id="cases"></a>
## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>
____

   - *Добавление и удаление товаров из корзины*
   - *Проверка фильтрации ноутбуков по производителю*
   - *Проверка открытия раздела 'Барахолка'*
   - *Проверка видимости основного логотипа сайта*
   - *Проверка отображения Возрастного ограничения '18+'главной странице*
   - *Проверка отображения Ссылки 'Onlíner Клевер' на главной странице*
   - *Выбор чекбокса Prime и проверка наличия логотипа Prime у первого товара*




____
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/Diplom1VasiliP/)</a>
____


### **Параметры сборки в Jenkins:**

- *TASK*
- - *test* - Все тесты
- - *smoke_test* - Тесты с тэгом "Smoke"

- *BROWSER (браузер, по умолчанию chrome)*
- *BROWSER_VERSION (Версия браузера)*
- *BROWSER_SIZE (размер окна браузера, по умолчанию 1920x1080)*
- *UI_BASE_URL (Сайт для UI-теста)*
- *TELEGRAM_TOKEN (Токен Телеграм-бота)*
- *SELENOID_USER, SELENOID_PASS (логин, пароль для удаленного сервера Selenoid)*

<a id="console"></a>
## Команды для запуска из терминала
___
***Локальный запуск:***
- Все тесты
```bash  
gradle clean test
```
- Smoke-тестs
```bash  
gradle clean smoke_test
```

___
<a id="allure"></a>
## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>[Allure](https://jenkins.autotests.cloud/job/Diplom1VasiliP/8/allure/) отчет</a>
___

### *UI-тест*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshots/uiallure1.png" width="850"> 
<img title="Allure Overview Dashboard" src="images/screenshots/uiallure2.png" width="850"> 
</p>  



----
<a id="jira"></a>
## <img alt="Jira" height="25" src="images/logo/Jira.svg" width="25"/></a> <a name="Jira"></a>Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-1554)</a>
<p align="center">  
<img title="Jira Dashboard" src="images/screenshots/uijira2.png" width="850"> 
</p>

----
<a id="testops"></a>
## <img alt="TestOps" height="25" src="images/logo/Allure2.svg" width="25"/></a> <a name="TestOps"></a>Интеграция с [TestOps](https://allure.autotests.cloud/launch/50472/tree?search=W3siaWQiOiJzdGF0dXMiLCJ0eXBlIjoidGVzdFN0YXR1c0FycmF5IiwidmFsdWUiOlsicGFzc2VkIl19XQ%3D%3D&treeId=9649)</a>
<p align="center">  
<img title="TestOps Dashboard" src="images/screenshots/uiTestOps1.png" width="850"> 
</p>  

----
<a id="telegram"></a>
## <img alt="Allure" height="25" src="images/logo/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="TelegramBot" src="images/screenshots/Telegram1.png" width="550">  
</p>


____
<a id="video"></a>
## <img alt="Selenoid" height="25" src="images/logo/Selenoid.svg" width="25"/></a> Примеры видео выполнения тестов на Selenoid
____
<p align="center">
<img title="Selenoid Video" src="images/video/UI.gif" width="550" height="350"  alt="video">   
</p>

