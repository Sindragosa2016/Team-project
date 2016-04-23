using OpenQA.Selenium;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Automation
{
    class SeleniumMethods
    {
        public static void Text(IWebDriver driver, string element, string value, string elementtype)
        {
             if(elementtype == "id")
            {
                driver.FindElement(By.Id(element)).SendKeys(value);
            }
            else if(elementtype == "Name")
            {
                driver.FindElement(By.Name(element)).SendKeys(value);
            }
        }

        public static void Click(IWebDriver driver, string element, string value, string elementtype)
        {
            if (value == "id")
            {
                driver.FindElement(By.Id(element)).Click();
            }
            else if (value == "Name")
            {
                driver.FindElement(By.Name(element)).Click();
            }
        }

        public static string GetText(IWebDriver driver, string element, string value, string elementtype)
        {
            if (elementtype == "id")
            {
                return driver.FindElement(By.Id(element)).Text;
            }
            else if (elementtype == "Name")
            {
                return driver.FindElement(By.Name(element)).Text;
            }
            else return String.Empty;
        }



    }
}
