using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Automation
{
    class Program
    {
        //Create reference for our browser
        IWebDriver driver = new ChromeDriver(@"C:\Users\ncek\Documents\Visual Studio 2015\Projects\Automation");
        static void Main(string[] args)
        {
            //Create reference for our browser
            //IWebDriver driver = new ChromeDriver(@"C:\Users\ncek\Documents\Visual Studio 2015\Projects\Automation");

            //Navigate to Kashpi page
            // driver.Navigate().GoToUrl("http://kashpi.com/");

            //Find Element
            //IWebElement element = driver.FindElement(By.ClassName("mainlevel-nav"));

            //Perform ops
            //element.Click();

        }
        [SetUp]
        public void Initialize()
        {
            //Navigate to Kashpi page
            driver.Navigate().GoToUrl("http://kashpi.com/");
        }
        [Test]
        public void ExecuteTest()
        {
            //Find Element
            IWebElement element = driver.FindElement(By.ClassName("mainlevel-nav"));

            //Perform ops
            element.Click();
            Console.WriteLine("Executed Test");

            IWebElement elementtype = driver.FindElement(By.Id("active_menu-nav"));
            elementtype.Click();

        }

        [TearDown]
        public void CloseUp()
        {
            driver.Close();
            Console.WriteLine("Closed Test");
        }



    }
}
