(function webpackUniversalModuleDefinition(root, factory) {
	if(typeof exports === 'object' && typeof module === 'object')
		module.exports = factory();
	else if(typeof define === 'function' && define.amd)
		define([], factory);
	else if(typeof exports === 'object')
		exports["snyder-consulting"] = factory();
	else
		root["snyder-consulting"] = factory();
})(this, function() {
return /******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId]) {
/******/ 			return installedModules[moduleId].exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			i: moduleId,
/******/ 			l: false,
/******/ 			exports: {}
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.l = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// define getter function for harmony exports
/******/ 	__webpack_require__.d = function(exports, name, getter) {
/******/ 		if(!__webpack_require__.o(exports, name)) {
/******/ 			Object.defineProperty(exports, name, { enumerable: true, get: getter });
/******/ 		}
/******/ 	};
/******/
/******/ 	// define __esModule on exports
/******/ 	__webpack_require__.r = function(exports) {
/******/ 		if(typeof Symbol !== 'undefined' && Symbol.toStringTag) {
/******/ 			Object.defineProperty(exports, Symbol.toStringTag, { value: 'Module' });
/******/ 		}
/******/ 		Object.defineProperty(exports, '__esModule', { value: true });
/******/ 	};
/******/
/******/ 	// create a fake namespace object
/******/ 	// mode & 1: value is a module id, require it
/******/ 	// mode & 2: merge all properties of value into the ns
/******/ 	// mode & 4: return value when already ns object
/******/ 	// mode & 8|1: behave like require
/******/ 	__webpack_require__.t = function(value, mode) {
/******/ 		if(mode & 1) value = __webpack_require__(value);
/******/ 		if(mode & 8) return value;
/******/ 		if((mode & 4) && typeof value === 'object' && value && value.__esModule) return value;
/******/ 		var ns = Object.create(null);
/******/ 		__webpack_require__.r(ns);
/******/ 		Object.defineProperty(ns, 'default', { enumerable: true, value: value });
/******/ 		if(mode & 2 && typeof value != 'string') for(var key in value) __webpack_require__.d(ns, key, function(key) { return value[key]; }.bind(null, key));
/******/ 		return ns;
/******/ 	};
/******/
/******/ 	// getDefaultExport function for compatibility with non-harmony modules
/******/ 	__webpack_require__.n = function(module) {
/******/ 		var getter = module && module.__esModule ?
/******/ 			function getDefault() { return module['default']; } :
/******/ 			function getModuleExports() { return module; };
/******/ 		__webpack_require__.d(getter, 'a', getter);
/******/ 		return getter;
/******/ 	};
/******/
/******/ 	// Object.prototype.hasOwnProperty.call
/******/ 	__webpack_require__.o = function(object, property) { return Object.prototype.hasOwnProperty.call(object, property); };
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";
/******/
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(__webpack_require__.s = 0);
/******/ })
/************************************************************************/
/******/ ({

/***/ "./kotlin/snyder-consulting.js":
/*!*************************************!*\
  !*** ./kotlin/snyder-consulting.js ***!
  \*************************************/
/*! no static exports found */
/***/ (function(module, exports) {

eval("throw new Error(\"Module build failed (from C:/Users/Andrew/IdeaProjects/SnyderConsulting/build/js/node_modules/source-map-loader/dist/cjs.js):\\nError: Cannot find module 'C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\schema-utils\\\\src\\\\index.js'. Please verify that the package.json has a valid \\\"main\\\" entry\\n    at tryPackage (internal/modules/cjs/loader.js:316:19)\\n    at Function.Module._findPath (internal/modules/cjs/loader.js:705:18)\\n    at Function.Module._resolveFilename (internal/modules/cjs/loader.js:969:27)\\n    at Function.Module._load (internal/modules/cjs/loader.js:864:27)\\n    at Module.require (internal/modules/cjs/loader.js:1044:19)\\n    at require (C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\v8-compile-cache\\\\v8-compile-cache.js:159:20)\\n    at Object.<anonymous> (C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\source-map-loader\\\\dist\\\\index.js:10:43)\\n    at Module._compile (C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\v8-compile-cache\\\\v8-compile-cache.js:192:30)\\n    at Object.Module._extensions..js (internal/modules/cjs/loader.js:1178:10)\\n    at Module.load (internal/modules/cjs/loader.js:1002:32)\\n    at Function.Module._load (internal/modules/cjs/loader.js:901:14)\\n    at Module.require (internal/modules/cjs/loader.js:1044:19)\\n    at require (C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\v8-compile-cache\\\\v8-compile-cache.js:159:20)\\n    at Object.<anonymous> (C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\source-map-loader\\\\dist\\\\cjs.js:3:16)\\n    at Module._compile (C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\v8-compile-cache\\\\v8-compile-cache.js:192:30)\\n    at Object.Module._extensions..js (internal/modules/cjs/loader.js:1178:10)\\n    at Module.load (internal/modules/cjs/loader.js:1002:32)\\n    at Function.Module._load (internal/modules/cjs/loader.js:901:14)\\n    at Module.require (internal/modules/cjs/loader.js:1044:19)\\n    at require (C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\v8-compile-cache\\\\v8-compile-cache.js:159:20)\\n    at loadLoader (C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\loader-runner\\\\lib\\\\loadLoader.js:18:17)\\n    at iteratePitchingLoaders (C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\loader-runner\\\\lib\\\\LoaderRunner.js:169:2)\\n    at runLoaders (C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\loader-runner\\\\lib\\\\LoaderRunner.js:365:2)\\n    at NormalModule.doBuild (C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\webpack\\\\lib\\\\NormalModule.js:295:3)\\n    at NormalModule.build (C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\webpack\\\\lib\\\\NormalModule.js:446:15)\\n    at Compilation.buildModule (C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\webpack\\\\lib\\\\Compilation.js:739:10)\\n    at C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\webpack\\\\lib\\\\Compilation.js:981:14\\n    at C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\webpack\\\\lib\\\\NormalModuleFactory.js:409:6\\n    at C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\webpack\\\\lib\\\\NormalModuleFactory.js:155:13\\n    at AsyncSeriesWaterfallHook.eval [as callAsync] (eval at create (C:\\\\Users\\\\Andrew\\\\IdeaProjects\\\\SnyderConsulting\\\\build\\\\js\\\\node_modules\\\\tapable\\\\lib\\\\HookCodeFactory.js:33:10), <anonymous>:4:1)\");//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiIuL2tvdGxpbi9zbnlkZXItY29uc3VsdGluZy5qcy5qcyIsInNvdXJjZVJvb3QiOiIifQ==\n//# sourceURL=webpack-internal:///./kotlin/snyder-consulting.js\n");

/***/ }),

/***/ 0:
/*!*******************************************!*\
  !*** multi ./kotlin/snyder-consulting.js ***!
  \*******************************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! C:\Users\Andrew\IdeaProjects\SnyderConsulting\build\js\packages\snyder-consulting\kotlin\snyder-consulting.js */"./kotlin/snyder-consulting.js");


/***/ })

/******/ });
});