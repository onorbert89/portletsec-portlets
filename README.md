# Portlet Security 101

Author: Péter Borkuti, 2018.01.31

Let's learn together about security by hands-in examples! Be an attacker and break into my portlets! See the code which makes this possible, consider and do everything in the opposite way.

## Reflected XSS

Step-by-step reflected xss. This is just some basic things, like a warming up. Find request parameters, craft them and see what happen.

Ultimate goal: change file download URL via XSS

## Stored XSS

Same as above but stored.

## Include tricks

Tricks wth a Liferay MVC portlet. Can you think, that user will not see a jsp if you not giving a link to it?

(I forget to put it onto a page!)

## File Upload

Always be aware of file uploads. Check everything. When a file got its way into your system an attacker can use it for everything.

## SQL Injection

It is impossible (IMHO) to do it in Liferay, however, see my portlet. If you dont use Liferay services, backend and guides and you create sqls by hand, see what could happen.

[how-to-avoid-sql-inj-hibernate](http://blog.harpoontech.com/2008/10/how-to-avoid-sql-injection-in-hibernate.html)
[OWASP](https://www.owasp.org/index.php/Hibernate)


## Hidden post requests 

So you are a smart, well trained, cautious IT people? Do you think, that nasty things could happen only when you push some buttons or click on links? No, javascript can run in the background, can post forms and make transactions behind you. Let's try to do that!

## Usage

* Install Liferay Portal CE GA5 (ITs free and open source)
* Run
* Deploy all the portlets from this repo's jar dir
* Put the portlets into one page or to different pages
* Follow the instructions

If you are lazy, Import Public_Pages.lar and that will create pages and put the portlets in a meaningful order into them. Plus adds some text into the Welcome page.