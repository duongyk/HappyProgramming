USE master
GO
alter database [PRJ_SWP] set single_user with rollback immediate
if exists (select * from sysdatabases where name='PRJ_SWP') drop database PRJ_SWP
GO

CREATE DATABASE [PRJ_SWP]
GO 

Use [PRJ_SWP]
GO

CREATE table dbo.[User] (
[uId] int not null identity(1,1) primary key,
username nvarchar(63) not null ,
[password] nvarchar(63) not null,
fullname nvarchar(63) not null,
uMail nvarchar(63),
uPhone nchar(10),
DOB date,
gender nvarchar(10),
uAvatar nvarchar(255),
uRole int not null, -- 1: mentee, 2: mentor, 3: admin
--[status] bit,
)

CREATE table dbo.[Skill] (
[sId] int not null identity(1,1) primary key, --skill id
sName nvarchar(63) not null,
sDetail nvarchar(MAX) not null,
sImage nvarchar(MAX) not null,
--[status] nvarchar(63) not null, -- chua hoc, dang hoc, da hoc xong
)

CREATE table dbo.[UserSkill] (
[uId] int not null,
[sId] int not null,
[usStatus] nvarchar(63) not null, -- chua hoc, dang hoc, da hoc xong
FOREIGN KEY ([uId]) REFERENCES dbo.[User]([uId]),
FOREIGN KEY ([sId]) REFERENCES dbo.[Skill]([sId]),
)

CREATE table dbo.[Request](
rId int not null identity(1,1) primary key,
--[sId] int not null,
title nvarchar(63) not null,
content nvarchar(255) not null,
fromId int not null,
toId int not  null,
deadlineDate date not null,
--deadlineHour datetime not null,
[rStatus] nvarchar(63) not null, -- pending, inprocess, done, cancelled
FOREIGN KEY ([fromId]) REFERENCES dbo.[User]([uId]),
FOREIGN KEY ([toId]) REFERENCES dbo.[User]([uId]),
)

CREATE table dbo.[RequestSkill](
rId int not null,
[sId] int not null,
FOREIGN KEY ([sId]) REFERENCES dbo.[Skill]([sId]),
FOREIGN KEY ([rId]) REFERENCES dbo.[Request]([rId]),
)

CREATE table dbo.[CV] (
[uId] int not null,
profession nvarchar(255) not null,
professionIntro nvarchar(255) not null,
serviceDescript nvarchar(255) not null,
achievement nvarchar(255) not null,
FOREIGN KEY ([uId]) REFERENCES dbo.[User]([uId]),
)

CREATE table dbo.[SkillMentor] (
[uId] int not null,
[sId] int not null ,
FOREIGN KEY ([uId]) REFERENCES dbo.[User]([uId]),
FOREIGN KEY ([sId]) REFERENCES dbo.[Skill]([sId]),
)

CREATE table dbo.[Rating] (
fromId int not null,
toId int not null,
comment nvarchar(255),
ratingAmount int not null CHECK(1<= ratingAmount AND ratingAmount <=5),
ratingDate date,
FOREIGN KEY ([fromId]) REFERENCES dbo.[User]([uId]),
FOREIGN KEY ([toId]) REFERENCES dbo.[User]([uId]),
)

---------------------------

-----dbo.[User]
--mentee data
INSERT INTO [User](username, [password], fullname, uMail, uPhone, DOB, gender, uAvatar, uRole) VALUES ('mentee01', 'Daxua011', 'Yasuo', 'menteeno1@fpt.edu.vn', '0932322287', '2001-11-09', 'Male', '', '1');
INSERT INTO [User](username, [password], fullname, uMail, uPhone, DOB, gender, uAvatar, uRole) VALUES ('mentee02', 'Hasagi0110', 'GiangNV', 'giangnvthe150748@fpt.edu.vn', '0123456789', '2001-04-12', 'Male', '', '1');
INSERT INTO [User](username, [password], fullname, uMail, uPhone, DOB, gender, uAvatar, uRole) VALUES ('mentee03', 'Mentee003', 'DuongVV', 'duongvvhe150773@fpt.edu.vn', '1234567891', '2001-05-10', 'Male', '', '1');
INSERT INTO [User](username, [password], fullname, uMail, uPhone, DOB, gender, uAvatar, uRole) VALUES ('mentee04', 'Mentee004', 'ThangTV', 'thangtvhe151307@fpt.edu.vn', '2345678912', '2001-11-24', 'Male', '', '1');
INSERT INTO [User](username, [password], fullname, uMail, uPhone, DOB, gender, uAvatar, uRole) VALUES ('mentee05', 'Mentee005', 'ToanPK', 'toangpk131393@fpt.edu.vn', '3456789123', '2001-10-25', 'Male', '', '1');
--mentor data
INSERT INTO [User](username, [password], fullname, uMail, uPhone, DOB, gender, uAvatar, uRole) VALUES ('mentor01', 'Mentor001', 'Chiisai Chinchin', 'chinchin01@gmail.com', '0136581923', '1995-04-01', 'Male', '', '2');
INSERT INTO [User](username, [password], fullname, uMail, uPhone, DOB, gender, uAvatar, uRole) VALUES ('mentor02', 'Mentor002', N'Chức Bảnh', 'chucnv04@gmail.com', '0169182735', '1995-11-30', 'Male', '', '2');
INSERT INTO [User](username, [password], fullname, uMail, uPhone, DOB, gender, uAvatar, uRole) VALUES ('mentor03', 'Mentor003', 'Harab Serapel', 'Aarabzaraq@gmail.com', '0182910265', '1989-06-15', 'Female', '', '2');
INSERT INTO [User](username, [password], fullname, uMail, uPhone, DOB, gender, uAvatar, uRole) VALUES ('mentor04', 'Mentor004', N'Tùng Puoy', 'tanon0150@gmail.com', '0138192741', '2001-04-12', 'Gay', '', '2');
INSERT INTO [User](username, [password], fullname, uMail, uPhone, DOB, gender, uAvatar, uRole) VALUES ('mentor05', 'Mentor005', N'Hoàng Hương', 'zknight180@gmail.com', '0174629104', '1999-06-11', 'Male', '', '2');
INSERT INTO [User](username, [password], fullname, uMail, uPhone, DOB, gender, uAvatar, uRole) VALUES ('mentor06', 'Mentor006', N'Thảo Thảo', 'thaokiuto345@gmail.com', '0175639001', '2001-12-25', 'Female', '', '2');
INSERT INTO [User](username, [password], fullname, uMail, uPhone, DOB, gender, uAvatar, uRole) VALUES ('mentor07', 'Mentor007', 'Kuriko Shinozaki', 'kurikoshinozaki@gmail.com', '0014837779', '1990-01-29', 'Female', '', '2');
INSERT INTO [User](username, [password], fullname, uMail, uPhone, DOB, gender, uAvatar, uRole) VALUES ('mentor08', 'Mentor008', 'Leon Foe', 'leonfoebartfort@gmail.com', '0285776812', '1996-10-03', 'Male', '', '2');
INSERT INTO [User](username, [password], fullname, uMail, uPhone, DOB, gender, uAvatar, uRole) VALUES ('mentor09', 'Mentor009', 'Olivia Park', 'parkolivia@gmail.com', '0938772247', '1989-09-24', 'Female', '', '2');
INSERT INTO [User](username, [password], fullname, uMail, uPhone, DOB, gender, uAvatar, uRole) VALUES ('mentor10', 'Mentor010', 'Seo Yoon', 'seoyoonalt@gmail.com', '0236581999', '2000-12-04', 'Female', '', '2');
--Admin data
INSERT INTO [User](username, [password], fullname, uMail, uPhone, DOB, gender, uAvatar, uRole) VALUES ('admin', 'administrator', 'admin', '', '', '', '', '', '3');


-----dbo.[SKill]
--Skills data
--1 Java
INSERT INTO [Skill](sName, sDetail, sImage) VALUES ('Java' ,'Java continues to rock the top position in the charts of “Programming Languages”. Recently Java has completed its 22nd year since its advent in 1995 by James Gosling and the recent being Java11 on September 25, 2018.

The long run has been made possible by its features of platform-independence, scalability, security, etc. Java derives its features of object-orientation, variables, Data types of C/C++ and in fact, the syntax that is influenced by C++.

Java is popularity is mainly due to its platform-independence feature which makes it run on different types of computer, either its Macintosh or Windows or Unix or Linux or even Mainframe/mobile phones as long as it has JVM installed in it.

Java code that has been written 15 years back can be made to run even on the latest JVM. One more notable feature is that it is fundamentally object-oriented and this makes Java be robust as Java objects contain no references to external data.', 'images/java.jpg');

--2 C
INSERT INTO [Skill](sName, sDetail, sImage) VALUES ('C' ,'C language is the oldest and most popular programming language. C is a general-purpose, imperative, computer programming language that supports structured programming. It was developed by Dennis Ritchie between 1969 and 1973.

It is designed to be compiled using a compiler, and provides low-level access to memory, offers an efficient mapping to machine instructions and requires minimal run-time support. Portability and capability of using in any embedded system are some of its outstanding features.

A portable assembly language that perfectly fits the operating systems along with a small run-time makes it a Universal Language.', 'https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/C_Programming_Language.svg/1200px-C_Programming_Language.svg.png'); 

--3 C++
INSERT INTO [Skill](sName,sDetail, sImage) VALUES ('C++' ,'C with Classes, the predecessor of C, C+++ was created by Bjarne Stroustrup in 1979. C++ is a general-purpose programming language. It has imperative, object-oriented and generic programming features.

Its design highlights include system programming, the flexibility of use, embedded resource constrained and performance efficiency with large systems.

C++ is a compiled language, that has its implementation available on many platforms. The other versions of programming languages like Java, C#, D etc., have been influenced by C++.

C with Classes added features to C compiler, includes classes, derived classes, strong typing, in-lining and default arguments. It was renamed to C++ by adding functions like virtual functions, operator-overloading, references, constants, type-safe, memory-allocation, improved type-checking, and a stand-alone compiler.

Its main components include direct mapping of hardware features and zero overhead abstractions based on those mappings. Though C++ is considered as a superset of C, it is strictly not true.', 'https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/ISO_C%2B%2B_Logo.svg/800px-ISO_C%2B%2B_Logo.svg.png');

--4 C#
INSERT INTO [Skill](sName, sDetail, sImage) VALUES ('C#' ,'C# is a general-purpose, multi-paradigm programming language. C# encompasses static typing, strong typing, lexically scoped, imperative, declarative, functional, generic, object-oriented (class-based), and component-oriented programming disciplines.

C# was designed by Anders Hejlsberg from Microsoft in 2000 and was later approved as an international standard by Ecma (ECMA-334) in 2002 and ISO (ISO/IEC 23270) in 2003. Microsoft introduced C# along with .NET Framework and Visual Studio, both of which were closed-source.', 'images/csharp.jpg');

--5 Python
INSERT INTO [Skill](sName, sDetail, sImage) VALUES ('Python' ,'Python is an interpreted high-level programming language for general programming purposes. It was released in 1991.

Python has been designed to give importance to code readability and significantly using whitespaces. Dynamic type, automatic memory management, supporting multiple programming paradigm(PO, Functional, procedural), a large comprehensive library of its own etc., are its notable features.

Python interpreters are available for many operating systems and it is an open source software. As of January 2018, it is the fourth most popular language (after Java, c, c++). A recent study analyzed that such scripting languages are more productive than conventional languages.

Python can be embedded in many software products, used in several Artificial Intelligence projects & in the Information security industry and can also serve as a scripting language for web applications.

Large organizations that use python include Wikipedia, Google, Yahoo etc. Libre office includes python and intends to replace Java with python. Go, Kotlin, Swift etc, have derived some of their features from python.

With the growing trend of Hadoop ecosystem that is dependent on Python, Java, and Scala, Python provides an efficient competition to Java (as the world of analytics does not have many Java programmers)', 'images/python.jpg');

--6 Ruby
INSERT INTO [Skill](sName, sDetail, sImage) VALUES ('Ruby' ,'Ruby is an interpreted, high-level, general-purpose programming language. It was designed and developed in the mid-1990s by Yukihiro "Matz" Matsumoto in Japan.

Ruby is dynamically typed and uses garbage collection and just-in-time compilation. It supports multiple programming paradigms, including procedural, object-oriented, and functional programming. According to the creator, Ruby was influenced by Perl, Smalltalk, Eiffel, Ada, BASIC, and Lisp.', 'images/ruby.jpg');

--7 PHP
INSERT INTO [Skill](sName, sDetail, sImage) VALUES ('PHP' ,'PHP is a general-purpose scripting language geared towards web development. It was originally created by Danish-Canadian programmer Rasmus Lerdorf in 1994. The PHP reference implementation is now produced by The PHP Group. PHP originally stood for Personal Home Page, but it now stands for the recursive initialism PHP: Hypertext Preprocessor.

PHP code is usually processed on a web server by a PHP interpreter implemented as a module, a daemon or as a Common Gateway Interface (CGI) executable. On a web server, the result of the interpreted and executed PHP code – which may be any type of data, such as generated HTML or binary image data – would form the whole or part of an HTTP response. Various web template systems, web content management systems, and web frameworks exist which can be employed to orchestrate or facilitate the generation of that response. Additionally, PHP can be used for many programming tasks outside of the web context, such as standalone graphical applications and robotic drone control. PHP code can also be directly executed from the command line.

The standard PHP interpreter, powered by the Zend Engine, is free software released under the PHP License. PHP has been widely ported and can be deployed on most web servers on a variety of operating systems and platforms.

The PHP language evolved without a written formal specification or standard until 2014, with the original implementation acting as the de facto standard which other implementations aimed to follow. Since 2014, work has gone on to create a formal PHP specification.', 'images/php.jpg');

--8 HTML
INSERT INTO [Skill](sName, sDetail, sImage) VALUES ('HTML' ,'The HyperText Markup Language, or HTML is the standard markup language for documents designed to be displayed in a web browser. It can be assisted by technologies such as Cascading Style Sheets (CSS) and scripting languages such as JavaScript.

Web browsers receive HTML documents from a web server or from local storage and render the documents into multimedia web pages. HTML describes the structure of a web page semantically and originally included cues for the appearance of the document.

HTML elements are the building blocks of HTML pages. With HTML constructs, images and other objects such as interactive forms may be embedded into the rendered page. HTML provides a means to create structured documents by denoting structural semantics for text such as headings, paragraphs, lists, links, quotes and other items. HTML elements are delineated by tags, written using angle brackets. Tags such as <img /> and <input /> directly introduce content into the page. Other tags such as <p> surround and provide information about document text and may include other tags as sub-elements. Browsers do not display the HTML tags, but use them to interpret the content of the page.

HTML can embed programs written in a scripting language such as JavaScript, which affects the behavior and content of web pages. Inclusion of CSS defines the look and layout of content. The World Wide Web Consortium (W3C), former maintainer of the HTML and current maintainer of the CSS standards, has encouraged the use of CSS over explicit presentational HTML since 1997.', 'images/html.jpg');

--9 JavaScript
INSERT INTO [Skill](sName, sDetail, sImage) VALUES ('JavaScript' ,'JavaScript is a dynamic, weakly typed, Prototype-based, high-level, interpreted programming language. Its take the position of one of the core technologies of the world wide web. It enables the creation of interactive webpages.

Initially, only client-side web browsers were implemented in JavaScript, but it is now embedded in various host software including server side in web servers and also in run-time environments that make it function on mobile, and desktop applications.

Even though it carries a similarity in its name with Java Language, it is distinct from Java by its dynamic functionality, human-readable code, etc.

The supporting technologies or languages that are related to JavaScript are JSON (Data Interchange Format), jQuery (Client-side HTML Scripting), Angular and Angular (Web Application Frameworks for developing SPA), React (JS Library), asm.js etc.

Standardization of web Assembly by W3C made programming Languages such as C, C++, Java as well as JS to author client-side code for the world wide web. However, JavaScript has now risen to biblical levels and experts say that its time to go down…and yes….partially correct too.

As the preferred language for client-side development varies along with the web assembly back ends, JavaScript is at times confusing to use owing to the availability of several web options.', 'images/js.jpg');

--10 Swift
INSERT INTO [Skill](sName, sDetail, sImage) VALUES ('Swift' ,'Swift is a general purpose, multi-paradigm, compiled programming that was developed by Apple Inc. for iOS, MacOS and for working with Cocoa frameworks. It uses the Objective C runtime library which allows C, C++ to run within one program.

Swift offers core concepts like dynamic dispatch, late binding, extensible programming, and address errors like null pointer de-referencing, supporting the protocol, extensibility, struts, classes etc. Swift won the first place for being the most Loved Programming language in 2015-2016.', 'images/swift.jpg');

--11 SQL
INSERT INTO [Skill](sName, sDetail, sImage) VALUES ('SQL' ,'SQL is a domain-specific language used in programming and designed for managing data held in a relational database management system (RDBMS), or for stream processing in a relational data stream management system (RDSMS). It is particularly useful in handling structured data, i.e. data incorporating relations among entities and variables.

SQL offers two main advantages over older read–write APIs such as ISAM or VSAM. Firstly, it introduced the concept of accessing many records with one single command. Secondly, it eliminates the need to specify how to reach a record, e.g. with or without an index.

Originally based upon relational algebra and tuple relational calculus, SQL consists of many types of statements, which may be informally classed as sublanguages, commonly: a data query language (DQL), a data definition language (DDL), a data control language (DCL), and a data manipulation language (DML). The scope of SQL includes data query, data manipulation (insert, update and delete), data definition (schema creation and modification), and data access control. Although SQL is essentially a declarative language (4GL), it also includes procedural elements.

SQL was one of the first commercial languages to use Edgar F. Codd’s relational model. The model was described in his influential 1970 paper, "A Relational Model of Data for Large Shared Data Banks". Despite not entirely adhering to the relational model as described by Codd, it became the most widely used database language.

SQL became a standard of the American National Standards Institute (ANSI) in 1986, and of the International Organization for Standardization (ISO) in 1987. Since then, the standard has been revised to include a larger set of features. Despite the existence of standards, most SQL code requires at least some changes before being ported to different database systems.', 'images/sql.jpg');

--12 CSS
INSERT INTO [Skill](sName, sDetail, sImage) VALUES ('CSS' ,'Cascading Style Sheets (CSS) is a style sheet language used for describing the presentation of a document written in a markup language such as HTML.[1] CSS is a cornerstone technology of the World Wide Web, alongside HTML and JavaScript.

CSS is designed to enable the separation of presentation and content, including layout, colors, and fonts. This separation can improve content accessibility, provide more flexibility and control in the specification of presentation characteristics, enable multiple web pages to share formatting by specifying the relevant CSS in a separate .css file which reduces complexity and repetition in the structural content as well as enabling the .css file to be cached to improve the page load speed between the pages that share the file and its formatting.

Separation of formatting and content also makes it feasible to present the same markup page in different styles for different rendering methods, such as on-screen, in print, by voice (via speech-based browser or screen reader), and on Braille-based tactile devices. CSS also has rules for alternate formatting if the content is accessed on a mobile device.

The name cascading comes from the specified priority scheme to determine which style rule applies if more than one rule matches a particular element. This cascading priority scheme is predictable.

The CSS specifications are maintained by the World Wide Web Consortium (W3C). Internet media type (MIME type) text/css is registered for use with CSS by RFC 2318 (March 1998). The W3C operates a free CSS validation service for CSS documents.

In addition to HTML, other markup languages support the use of CSS including XHTML, plain XML, SVG, and XUL.', 'images/css.jpg');



-----dbo.[UserSKill]
--Mentee no.1
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (1, 1, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (1, 2, 'inprocess');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (1, 3, 'inprocess');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (1, 4, 'inprocess');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (1, 5, 'inprocess');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (1, 6, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (1, 7, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (1, 8, 'done');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (1, 9, 'done');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (1, 10, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (1, 11, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (1, 12, 'done');

--Mentee no.2
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (2, 1, 'inprocess');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (2, 2, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (2, 3, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (2, 4, 'inprocess');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (2, 5, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (2, 6, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (2, 7, 'inprocess');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (2, 8, 'inprocess');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (2, 9, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (2, 10, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (2, 11, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (2, 12, 'done');

--Mentee no.3
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (3, 1, 'done');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (3, 2, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (3, 3, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (3, 4, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (3, 5, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (3, 6, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (3, 7, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (3, 8, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (3, 9, 'done');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (3, 10, 'done');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (3, 11, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (3, 12, 'inprocess');

--Mentee no.4
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (4, 1, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (4, 2, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (4, 3, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (4, 4, 'done');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (4, 5, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (4, 6, 'inprocess');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (4, 7, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (4, 8, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (4, 9, 'done');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (4, 10, 'done');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (4, 11, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (4, 12, 'not');

--Mentee no.5
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (5, 1, 'inprocess');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (5, 2, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (5, 3, 'done');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (5, 4, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (5, 5, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (5, 6, 'done');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (5, 7, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (5, 8, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (5, 9, 'inprocess');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (5, 10, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (5, 11, 'not');
INSERT INTO [UserSkill]([uId], [sID], usStatus) VALUES (5, 12, 'not');


-----dbo.[CV]
INSERT INTO [CV]([uId], profession, professionIntro, serviceDescript, achievement) VALUES (6, 'Teacher', 'My name is Chinchin, and i am a teacher at FPT University. I have been teaching at FPTU for about 10 years now still teaching. My job is to provide learner knowledge and advice on programming skill-realated topics.', 'Provide advice, answer questions, provide guidance', '- Teaching at a famous University
- Participated in various Programming contests as Adviser'); --chinchin
INSERT INTO [CV]([uId], profession, professionIntro, serviceDescript, achievement) VALUES (7, 'Professor', 'My name is Chuc and i am currently a Professor of Harvard University. I’m teaching multiple programming languages used in game-developing. You can contact me if you are interested in learning these progarmming languages.', 'Provide advice, answer questions, provide guidance', '- Participated in developing famous games
- Participated in various Programming contests as Adviser 
- Have many years of expeirence in game-developing industry'); --chuc
INSERT INTO [CV]([uId], profession, professionIntro, serviceDescript, achievement) VALUES (8, 'Teacher', 'My name is Harab, i am teacher of software engineering department of RIT University.', 'Provide advice, answer questions, provide guidance', '- Participate in various Programming contests as Adviser
- Participated in developing various project'); --harab	
INSERT INTO [CV]([uId], profession, professionIntro, serviceDescript, achievement) VALUES (9, 'Feeder', N'My name is Tung Puoy, i have experience in teaching how to become a tạ.', 'Provide advice, answer questions, provide guidance, provide live examples if needed', N'- Have experience of being tạ in many fields
- Top feeder all over the world
- Skilled at feeding and teaching people how to tolerate anger'); --buoy
INSERT INTO [CV]([uId], profession, professionIntro, serviceDescript, achievement) VALUES (10, 'Professor Assistant', 'My name is Huong and iam currently working as an Assistant of a Professor at Harvard University.', 'Provide advice, answer questions', '- Graduated from Codegym
- Many years of experience in full-stack web developing'); --huong
INSERT INTO [CV]([uId], profession, professionIntro, serviceDescript, achievement) VALUES (11, 'Professor', 'My name is Thao, i am working at FPT University as a Professor of software engineering department.', 'Provide peronal guidance, provide personal support', '- Many years of experience in full-stack web developing
- Participated in various Programming contests as Adviser'); --thao
INSERT INTO [CV]([uId], profession, professionIntro, serviceDescript, achievement) VALUES (12, 'Teacher', 'My name is Kuriko, i am working at FPT University and expiertised in front-end web developing', 'Provide peronal guidance, provide personal support', '- Many years of experience in front-end web developing'); --kuriko
INSERT INTO [CV]([uId], profession, professionIntro, serviceDescript, achievement) VALUES (13, 'Professor Assistant', 'My name is Leon, i am a student and a assistant of a professor at RIT University.', 'Provide advice, answer questions, provide guidance, provide live examples if needed', '- Participated in various Programming contests'); --leon
INSERT INTO [CV]([uId], profession, professionIntro, serviceDescript, achievement) VALUES (14, 'Professor', 'My name is Ovilia Park, i am working as a Professor and the head of IT department at Coffin company.', 'Provide advice, answer questions, provide guidance', '- Have years of field-experience
- Participated in developing various project
- Participated in various Programming contests as examiner'); --olivia
INSERT INTO [CV]([uId], profession, professionIntro, serviceDescript, achievement) VALUES (15, 'Teacher', 'My name is Seo Yoon, i’m a teacher at Sejong University and expertised in back-end web developing.', 'Provide advice, answer questions, provide guidance', '- Participated in developing various project
- Participated in various Programming contests as examiner'); --seo


-----dbo.[MentorSkill]
--Mentor no.01 chinchin
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(6, 1);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(6, 2);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(6, 5);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(6, 10);

--Mentor no.02 Chuc
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(7, 1);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(7, 2);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(7, 3);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(7, 4);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(7, 11);

--Mentor no.03 Harab
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(8, 5);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(8, 6);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(8, 7);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(8, 10);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(8, 11);

--Mentor no.04 Puoy
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(9, 12);

--Mentor no.05 Huong
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(10, 1);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(10, 2);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(10, 8);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(10, 9);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(10, 11);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(10, 12);

--Mentor no.06 Thao
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(11, 5);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(11, 6);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(11, 7);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(11, 8);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(11, 11);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(11, 12);

--Mentor no.07 Kuriko
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(12, 1);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(12, 8);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(12, 10);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(12, 7);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(12, 12);

--Mentor no.08 Leon
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(13, 4);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(13, 5);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(13, 6);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(13, 7);

--Mentor no.09 Olivia
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(14, 4);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(14, 6);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(14, 7);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(14, 10);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(14, 3);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(14, 2);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(14, 5);

--Mentor no.010 Seo
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(15, 1);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(15, 6);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(15, 7);
INSERT INTO [SkillMentor]([uId],[sId]) VALUES(15, 10);



-----dbo.[Request]
--Mentee no.01 request
--rId 1
INSERT INTO [Request](title, content, fromId, toId, deadlineDate, rStatus) VALUES ('Implement java in html', 'I have problem with puting java code into my HTML page, can you show me how to solve this problem.', 1, 12, '2021-09-21', 'pending');
--rId 2
INSERT INTO [Request](title, content, fromId, toId, deadlineDate, rStatus) VALUES ('Learn code for game-developing', 'I want to learn C, C++ and C# but i dont know where to start, can you help me.', 1, 7, '2021-09-11', 'processing');
--rId 3
INSERT INTO [Request](title, content, fromId, toId, deadlineDate, rStatus) VALUES ('Learn code for web-design', 'I want to learn HTML5, JavaScript and CSS for web-design, i want your support in my learning.', 1, 10, '2021-09-21', 'finished');
--rId 4
INSERT INTO [Request](title, content, fromId, toId, deadlineDate, rStatus) VALUES ('Learn CSS', 'I want to impove my CSS skill, can you help me.', 1, 9, '2021-09-21', 'cancelled');


-----dbo.[RequestSkill]
INSERT INTO [RequestSkill](rId, [sId]) VALUES (1, 1);
INSERT INTO [RequestSkill](rId, [sId]) VALUES (1, 8);
INSERT INTO [RequestSkill](rId, [sId]) VALUES (1, 11);

INSERT INTO [RequestSkill](rId, [sId]) VALUES (2, 2);
INSERT INTO [RequestSkill](rId, [sId]) VALUES (2, 3);
INSERT INTO [RequestSkill](rId, [sId]) VALUES (2, 4);

INSERT INTO [RequestSkill](rId, [sId]) VALUES (3, 8);
INSERT INTO [RequestSkill](rId, [sId]) VALUES (3, 9);
INSERT INTO [RequestSkill](rId, [sId]) VALUES (3, 12);

INSERT INTO [RequestSkill](rId, [sId]) VALUES (4, 12);


-----dbo.[Rating]
INSERT INTO [Rating](fromId, toId, comment, ratingAmount, ratingDate) VALUES (1, 7, 'Very goodat teaching', 5, '2021-09-20');
INSERT INTO [Rating](fromId, toId, comment, ratingAmount, ratingDate) VALUES (1, 10, 'Good', 4, '2021-10-01');
INSERT INTO [Rating](fromId, toId, comment, ratingAmount, ratingDate) VALUES (1, 5, 'Very bad mentor', 1, '2021-09-22');


















